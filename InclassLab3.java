public class InclassLab3 {
    int [][] workinghours = {
            {2,4,3,4,5,8,8},
            {7,3,4,3,3,4,4},
            {3,3,4,3,3,2,2},
            {9,3,4,7,3,4,1},
            {3,5,4,3,6,3,8},
            {3,4,4,6,3,4,4},
            {3,7,4,8,3,8,4},
            {6,3,5,9,2,7,9}
    };
    public static void main(String[] args) {
        InclassLab3 obj = new InclassLab3();
        int total = 0;
        
        for (int i = 0; i < obj.workinghours.length; i++) {
            for (int j = 0; j < obj.workinghours[i].length; j++) {
                total += obj.workinghours[i][j];
            }
            System.out.println("Total working hours of employee " + (i + 1) + " is: " + total);
            total = 0;
        }
        // in descending order
        for (int i = 0; i < obj.workinghours.length - 1; i++) {
            for (int j = 0; j < obj.workinghours.length - 1 - i; j++) {
                int total1 = 0;
                int total2 = 0;
                for (int k = 0; k < obj.workinghours[j].length; k++) {
                    total1 += obj.workinghours[j][k];
                    total2 += obj.workinghours[j + 1][k];
                }
                if (total1 < total2) {
                    int[] temp = obj.workinghours[j];
                    obj.workinghours[j] = obj.workinghours[j + 1];
                    obj.workinghours[j + 1] = temp;
                }
            }
        }
        System.out.println("\n--------After sorting in descending order:---------\n");
        for (int i = 0; i < obj.workinghours.length; i++)   {
            total = 0;
            for (int j = 0; j < obj.workinghours[i].length; j++) {
                total += obj.workinghours[i][j];
            }
            System.out.println("Total working hours of employee " + (i + 1) + " is: " + total);
        }
    }
}
