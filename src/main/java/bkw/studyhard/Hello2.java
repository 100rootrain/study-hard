package bkw.studyhard;


    class Hello1{

        int a=10;
        int b=20;
        int c = a+b;


    }

    class Tv{
        public static void main(String[] args){
            Tv[] tvArr = new Tv[3];
            tvArr[0] = new Tv();
            tvArr[1] = new Tv();
            tvArr[2] = new Tv();
            //tvArr.length;
            int tvArrLength = tvArr.length;
        }





    }

    class Mp3{
        public static void main(String[] args){
            System.out.println();

            Mp3[] mp3Arr = new Mp3[3];
            for(int i=0;i<mp3Arr.length;i++){
                mp3Arr[i] = new Mp3();
            }


        }

    }

