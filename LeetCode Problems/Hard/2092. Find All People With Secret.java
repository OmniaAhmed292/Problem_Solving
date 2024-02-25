//https://leetcode.com/problems/find-all-people-with-secret/description

// Helper method to find the root of a group
    public static int find(int[] groups, int index) {
        while (index != groups[index])
            index = groups[index];
        return index;
    }

        
            public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
                // Initialize an array to track group memberships
                int[] groups = new int[n];
                List<Integer> result = new ArrayList<>();
                List<Integer> temp = new ArrayList<>();

                // Initially, each person is in their own group
                for (int i = 0; i < n; ++i)
                    groups[i] = i;
                groups[firstPerson] = 0; // Set the firstPerson's group to 0

                // Sort meetings by time
                Arrays.sort(meetings, (a, b) -> Integer.compare(a[2], b[2]));

                int i = 0;
                while (i < meetings.length) {
                    int currentTime = meetings[i][2];
                    temp.clear();

                    // Process all meetings at the same time
                    while (i < meetings.length && meetings[i][2] == currentTime) {
                        int g1 = find(groups, meetings[i][0]);
                        int g2 = find(groups, meetings[i][1]);
                        groups[Math.max(g1, g2)] = Math.min(g1, g2);
                        temp.add(meetings[i][0]);
                        temp.add(meetings[i][1]);
                        ++i;
                    }

                    // Update group memberships
                    for (int j = 0; j < temp.size(); ++j) {
                        if (find(groups, temp.get(j)) != 0) {
                            groups[temp.get(j)] = temp.get(j);
                        }
                    }
                }

                // Add people from group 0 (connected to firstPerson) to the result
                for (int j = 0; j < n; ++j) {
                    if (find(groups, j) == 0)
                        result.add(j);
                }

                return result;
            }
