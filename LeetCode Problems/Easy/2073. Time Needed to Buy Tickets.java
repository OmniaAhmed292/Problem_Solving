//https://leetcode.com/problems/time-needed-to-buy-tickets

public int timeRequiredToBuy(int[] tickets, int k) {
           int n = tickets.length;
            int count = 0; int i=0;
        
            while(tickets[k]>0){
                if(i>=tickets.length)i=0;
                if(tickets[i]>0){
                    tickets[i]--;
                    count++;
                }
              i++;
            }
            
            return count;

    }


 public int timeRequiredToBuy(int[] tickets, int position) {
        Queue <Integer> queue = new LinkedList<>();
        for(int i = 0; i < tickets.length; i++){
            queue.add(tickets[i]);
        }
        int time = 0;
        while(!queue.isEmpty()){
            int current = queue.poll();
            time++;
            if(current == 1 && position == 0){
                break;
            }
            if(current > 1){
                queue.add(current - 1);
            }
            if(position == 0){
                position = queue.size() - 1;
            }else{
                position--;
            }
        }
        return time;
    }

