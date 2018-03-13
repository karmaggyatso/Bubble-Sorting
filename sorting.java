public class sorting {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            int [] list = {10,2,8,6,7,3};
            System.out.println("The old sequence: ");
            for (int i = 0; i<list.length; i++){
                System.out.print(list[i] + " ");
            }
            System.out.println();
            sorting(list);

            //hope this is helpful to you.
        }

        static int sorting(int [] s) { //made this function in static because our MAIN is in static
                                        //only static function can be called in another static.
            int store = 0;
            for (int i = 0; i<s.length-1; i++) { //this loop will keep on looping until i<6 in this case
                for (int j = 0; j < s.length - 1- i; j++) { //everytime i is increased, the condition size is decreased
                    if (s[j] > s[j + 1]) {
                        store = s[j]; //using bubble sort algorithm
                        s[j] = s[j + 1];
                        s[j + 1] = store;

                    }
                }
            }
            System.out.println("The new sequences: ");
            for (int i = 0; i< s.length; i++){
                System.out.print(s[i] + " ");
            }
            return 0;
        }

    }

