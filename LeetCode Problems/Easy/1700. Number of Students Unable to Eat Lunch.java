//https://leetcode.com/problems/number-of-students-unable-to-eat-lunch

 public int countStudents(int[] students, int[] sandwiches) {
        Stack <Integer> sands = new Stack<>();
        Queue <Integer> studs = new LinkedList<>();
        int s = 0;
        for(int i=students.length-1; i >= 0; i--){
            studs.add(students[i]);
        }
        for(int i=sandwiches.length-1; i >= 0; i--){
            sands.add(sandwiches[i]);
        }
        while(!studs.isEmpty() && !sands.isEmpty()){
            if(studs.peek() == sands.peek()){
               // System.out.println("stud"+studs.peek());
               // System.out.println("sand"+sands.peek());
                studs.poll();
                sands.pop();
                s=0;
            }else{
                studs.add(studs.poll());
                s++;
            }
            if(s >= studs.size() ) break;
        }
        return studs.size();
    }
