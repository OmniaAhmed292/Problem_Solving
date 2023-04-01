'''This script searches for files in the current directory, looks for the first line with a link to a LeetCode problem,
opens the problem URL and determines its difficulty, creates a subfolder based on the difficulty, and moves the file into the subfolder.
The script assumes that the links are in the format [Problem Title](https://leetcode.com/problems/problem-title/). '''

import os
import re
import time
import requests
from bs4 import BeautifulSoup

# Define the regular expression pattern for finding the first link in a file
link_pattern = re.compile(r"https://leetcode\.com/problems/[\w-]+/")

# Define the base URL for LeetCode problems
base_url = "https://leetcode.com"

# Define the folder to organize the files into (create if doesn't exist)
folder_name = "LeetCode Problems"
if not os.path.exists(folder_name):
    os.mkdir(folder_name)

# Loop through all files in the current directory
for filename in os.listdir("."):
    # Only process cpp files
    print("file", filename)
    if not filename.endswith(".cpp"):
        continue
    
    # Open the file and search for the first link
    with open(filename, "r") as f:
        first_line = f.readline()
        match = link_pattern.search(first_line)
        print(match)
        if not match:
            continue
        
        # Extract the URL of the LeetCode problem
        problem_url = match.group(0)
        print("URL:",problem_url)
        
        # Send a GET request to the problem URL and parse the HTML response
        response = requests.get(problem_url)
        soup = BeautifulSoup(response.content, "html.parser")
        print(response)
        
        # Find the difficulty tag and extract its text
        difficulty_tag = soup.find("div", {"class": "bg-yellow"})
        if(difficulty_tag):
            difficulty = "Medium"
            
        difficulty_tag = soup.find("div", {"class": "bg-olive"})
        if(difficulty_tag):
            difficulty = "Easy"
            
        difficulty_tag = soup.find("div", {"class": "bg-pink"})
        if(difficulty_tag):
            difficulty = "Hard"
       
        
        # Create the subfolder for the problem based on its difficulty
        subfolder_name = os.path.join(folder_name, difficulty)
        if not os.path.exists(subfolder_name):
            os.mkdir(subfolder_name)
        
        # Wait for 1 second before moving the file
        f.close()
        time.sleep(1)
        
        
        # Move the file into the subfolder
        os.rename(filename, os.path.join(subfolder_name, filename))

        

