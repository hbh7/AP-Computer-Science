public class PatternWithNestedForLoops {
    public static void main (String [] args) {

        int pos1 = 1;
        int pos2 = 8;
        String temp = "";

        for(int vLine = 0; vLine < 10; vLine++) {
            if(vLine == 0 || vLine == 9) {
                for (int j = 0; j < 10; j++) {
                    System.out.print("#");
                }
                System.out.println();
            } else {
                temp = "#";
                for(int hPos = 1; hPos < 9; hPos++) {
                    if(pos1 == hPos || pos2 == hPos) {
                        temp+= "#";
                    } else {
                        temp+= " ";
                    }
                }
                temp+= "#";
                pos1++;
                pos2--;
                System.out.println(temp);
            }
        }

    }
}
