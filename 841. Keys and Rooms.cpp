/* https://leetcode.com/problems/keys-and-rooms/description/ */
 //The code also checks if the graph is connected or not

class Solution {
public:
    bool canVisitAllRooms(vector<vector<int>>& rooms) {
        stack <int> keys;
        vector <int> visited(rooms.size(),0);
        int room=0;
        
        while(1){
    
            //Get the next rooms to be visited
            for(int i=0;i<rooms[room].size();i++){
            if(visited[room]==0){
                keys.push(rooms[room][i]);}
            }
            
            //Put the Current room as visited
            visited[room]++;
            //Check if there's not any rooms left
            if(keys.empty()==true) break;
            
            //if there are rooms left get the next from the stack
            room=keys.top();
            keys.pop();
        }
        //If there's any room unvisited(we couldn't reach it with our keys) then return false
        if(std::count(visited.begin(), visited.end(), 0)){return false;}
        return true; 
    }
};
