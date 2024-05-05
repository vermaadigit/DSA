public class Lec23_String_shortestPath {

    public static int shortestPath(String path){
        int NS = 0;
        int EW = 0;

        for(int i = 0; i < path.length(); i++){

            if (path.charAt(i) == 'N'){
                NS++;
            } else if (path.charAt(i) == 'S') {
                NS--;
            } else if (path.charAt(i) == 'E') {
                EW++;
            }
            else {
                EW--;
            }
        }

        int pathDis = (NS)*(NS) + (EW)*(EW);

        return (int) Math.sqrt(pathDis);
    }
    public static void main(String[] args){

        String path = "WNEENESENNN";

        System.out.print("The Shortest Distance is " + shortestPath(path));
    }
}
