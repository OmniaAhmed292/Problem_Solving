//https://leetcode.com/problems/number-of-students-unable-to-eat-lunch
//Simulation solution
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
//Constant space solution
public int countStudents(int[] students, int[] sandwiches) {
        int Circle = 0, Square = 0;

        for (int student : students){
            if (student == 1){
                Square++;
            } else {
                Circle++;
            }
        }

        for (int sandwiche : sandwiches){
            if (sandwiche == 1 && Square > 0){
                Square--;
            } else if (sandwiche == 0 && Circle > 0){
                Circle--;
            } else {
                return Square + Circle;
            }
        }
        return 0;
    }
