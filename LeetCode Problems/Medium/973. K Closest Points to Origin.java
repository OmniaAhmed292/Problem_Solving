//Faster solution using java sort O(log(n))
public int[][] kClosest(int[][] points, int k) {
        int res[][] = new int[k][2];
        Arrays.sort(points, (a, b) -> Double.compare(Math.sqrt(a[0] * a[0] + a[1] * a[1]), Math.sqrt(b[0] * b[0] + b[1] * b[1])));
        while(k>0){
            res[k-1]=points[k-1];
            k--;
        }
        return res;
    }
    
    
//Slower solution using linear sort(can be improved) 
//Can use priority Queue!

public int[][] kClosest(int[][] points, int k) {
        int res[][] = new int[k][2];
        double[] dist = new double[points.length];
        for (int i = 0; i < points.length; i++) {
            dist[i] = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            dist[i]= Math.sqrt(dist[i]);
        }
        for(int i=0;i<dist.length;i++){
            for(int j=i+1;j<dist.length;j++){
                if(dist[i]>dist[j]){
                    double temp=dist[i];
                    dist[i]=dist[j];
                    dist[j]=temp;
                    int[] temp1=points[i];
                    points[i]=points[j];
                    points[j]=temp1;
                }
            }
        }
        while(k>0){
            res[k-1]=points[k-1];
            k--;
        }
        return res;
    }
