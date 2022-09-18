//Реализовать волновой алгоритм

public class Ex1 {
    public static void Wave(int[][] arr, int row, int column){
        boolean flag = true;
        int countOfWave = 0;
        while (flag) {
            flag = false;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (arr[i][j] == countOfWave) {
                        flag = true;
                        if (j < column - 1){
                            if (arr[i][j + 1] == -1)
                                arr[i][j + 1] = countOfWave + 1;
                            }
                        if (j > 0){
                            if (arr[i][j - 1] == -1)
                                arr[i][j - 1] = countOfWave + 1;
                            }
                        if (i < row - 1){
                            if (arr[i + 1][j] == -1)
                                arr[i + 1][j] = countOfWave + 1;
                            }
                        if (i > 0){
                            if (arr[i - 1][j] == -1)
                                arr[i - 1][j] = countOfWave + 1;
                            }

                    }
                }
            }
            countOfWave++;
//            System.out.println("====="+ countOfWave +"=====");
//            PrintDobleArr(arr);
        }
    }

    static void PrintDobleArr(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == -2){
                    System.out.printf(" # ");
                }else{
                    System.out.printf(" " + arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //-2 стена, -1 пустая клетка
        int[][] labyrinth = new int[][]{    {-1,-1,-1,-2,-1},
                                            {-1,0,-1,-1,-1},
                                            {-2,-2,-1,-2,-2},
                                            {-1,-2,-1,-1,-1},
                                            {-1,-1,-1,-1,-1}   };
        PrintDobleArr(labyrinth);
        Wave(labyrinth, labyrinth.length, labyrinth[0].length); //вроде робает
        System.out.println("=====Wave=====");
        PrintDobleArr(labyrinth);

    }
}