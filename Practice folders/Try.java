
//   class StringBuilders {
//       public static StringBuilder work(StringBuilder a, StringBuilder b) {
//              a = new StringBuilder("a");
//              b.append("b");
//              return a;
//            }
//           public static void main(String[] args) {
//                 StringBuilder s1 = new StringBuilder("s1");
//                 StringBuilder s2 = new StringBuilder("s2");
//                 StringBuilder s3 = work(s1, s2);
//                 System.out.println("s1 = " + s1);
//                 System.out.println("s2 = " + s2);
//                 System.out.println("s3 = " + s3);
//               }
//     }
//     public class Try {
//       private int numberBags;
//       boolean call;
//       public Try() {
//         this(2);
//                call = false;
//               // LINE 2
//        }
//       public Try(int numberBags) {
//       this.numberBags = numberBags;
//        }
//       public static void main(String[] args) {
//              Try seed = new Try();
//              System.out.println(seed.numberBags);
// } } 
 
//   class Cheetah {
// int numSpots;
// public Cheetah(int numSpots) {
//   this.numSpots = numSpots;
// }
// public static void main(String[] args) {
// System.out.println(new Cheetah(50).numSpots);
// }
// }
//   class Order {
//           static String result = "";
//           { result += "c"; }
//           static
//           { result += "u"; }
//           { result += "r"; }
//        }
//    class OrderDriver {
//        public static void main(String[] args) {
//                System.out.print(Order.result + " ");
//                System.out.print(Order.result + " ");
//                new Order();
//                new Order();
//                System.out.print(Order.result + " ");
//    }
//    }
//   class Create {
//     Create() {
//          System.out.print("1 ");
//     }
//     Create(int num) {
//          System.out.print("2 ");
//     }
//     Create(Integer num) {
//         System.out.print("3 ");
//     }
//     Create(Object num) {
//        System.out.print("4 ");
//     }
//     Create(int... nums) {
//        System.out.print("5 ");
//     }
//     public static void main(String[] args) {
//          new Create(100);
//          new Create(1000L);
//     }
// }
