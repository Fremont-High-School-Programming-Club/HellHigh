import javax.swing.JOptionPane;




















public class Main {
   public static void main(String[] args) {
       int health = 100;
       int choice;
       int coins = 0;
       int day = 0;
       int sleep;
       String P1, P2, P3, P4, P5, P6;
       int a = (int) (Math.random() * 5 + 1);
       if (a == 1) {
           P1 = "AP Physics";
       } else {
           P1 = "Biology";
       }
       int b = (int) (Math.random() * 5 + 1);
       if (b == 1) {
           P2 = "Algebra 2";
       } else {
           P2 = "Algebra 1";
       }
       int c = (int) (Math.random() * 5 + 1);
       if (c == 1) {
           P3 = "AP Computer Science";
       } else {
           P3 = "Intro to Java";
       }
       int d = (int) (Math.random() * 5 + 1);
       if (d == 1) {
           P4 = "AP World History";
       } else {
           P4 = "World History";
       }
       int e = (int) (Math.random() * 5 + 1);
       if (e == 1) {
           P5 = "AP Japanese";
       } else {
           P5 = "Spanish 1";
       }
       int f = (int) (Math.random() * 5 + 1);
       if (f == 1) {
           P6 = "Wind Ensemble";
       } else {
           P6 = "Concert Band";
       }
























       JOptionPane.showMessageDialog(null, "Welcome to HellHigh, where Highschool never ends and you try to stay alive for as long as possible\n" + "Pro Tip: you must answer all questions asked in class with numbers or buttons\n" + "If you don’t answer or use commas and other special characters, or use letters, the game will break and you must restart");
















       JOptionPane.showMessageDialog(null, "Your schedule is: P1: " + P1 + " P2: " + P2 + " P3: " + P3 + " P4: " + P4 + " P5: " + P5 + " P6: " + P6);




































































































































































































































































       while (health >= 1) {
           day = day + 1;
           JOptionPane.showMessageDialog(null, "Day " + day + ", Coins: " + coins + " Health: " + health);
           // sleeping
           sleep = (int) (Math.random() * 8 + 1);
           if (sleep == 1) {
               health = health - 5;
               JOptionPane.showMessageDialog(null, "Oh no you slept late\nHealth: " + health);
           }






























































           // CLASSES
           if (a == 1) {
               int aa = (int) (Math.random() * 4 + 1);
               if (aa == 1) {
                   JOptionPane.showMessageDialog(null, "You got a hard question in Ap Phys");
                   String[] buttons = {"Celsius", "Kelvin"};
                   choice = JOptionPane.showOptionDialog(null, "Which among the following temperature scale is based upon absolute zero?",
                           null, JOptionPane.DEFAULT_OPTION, 0, null,
                           buttons, null);
                   if (choice == 0) {
                       JOptionPane.showMessageDialog(null, "You got the question wrong and got stuffed in a locker");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
                   if (choice == 1) {
                       JOptionPane.showMessageDialog(null, "Correct!");
                   }
               }








               else if (aa == 2) {
                   JOptionPane.showMessageDialog(null, "You got no hard questions in Ap Phys");
                   String[] buttons = {"James Clerk Maxwell", "Michael Faraday"};
                   choice = JOptionPane.showOptionDialog(null, "Who among the following is credited to work for the unification of electricity, magnetism and optics field of Physics?",
                           null, JOptionPane.DEFAULT_OPTION, 0, null,
                           buttons, null);
                   if (choice == 0) {
                       JOptionPane.showMessageDialog(null, "Correct!");
                   }
                   if (choice == 1) {
                       JOptionPane.showMessageDialog(null, "You got the question wrong and got stuffed in a locker");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
               } else {
                   JOptionPane.showMessageDialog(null, "You got a hard question in Ap Phys");
                   String[] buttons = {"Law of Conservation of Linear Momentum", "Conversion of Kinetic Energy to Potential Energy"};
                   choice = JOptionPane.showOptionDialog(null, "The recoiling of gun is an example of which of the following?",
                           null, JOptionPane.DEFAULT_OPTION, 0, null,
                           buttons, null);
                   if (choice == 0) {
                       JOptionPane.showMessageDialog(null, "Correct!");
                   }
                   if (choice == 1) {
                       JOptionPane.showMessageDialog(null, "You got the question wrong and got stuffed in a locker");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }}}
















           else   {
               int aaa = (int) (Math.random() * 5 + 1);
               if (aaa == 1) {
                   JOptionPane.showMessageDialog(null, "You got a hard question in Bio");
                   String[] buttons1 = {"Autecology", "Arthrology"};
                   choice = JOptionPane.showOptionDialog(null, "Which of the following branches of biology studies the Joint of bones is??",
                           null, JOptionPane.DEFAULT_OPTION, 0, null,
                           buttons1, null);
                   if (choice == 0) {
                       JOptionPane.showMessageDialog(null, "You got the question wrong and got stuffed in a locker");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
                   if (choice == 1) {
                       JOptionPane.showMessageDialog(null, "Correct!");
                   }
               }
               else if (aaa == 2) {
                   JOptionPane.showMessageDialog(null, "You got a hard question in Bio");
                   String[] buttons2 = {"Nitrogen", "Water Vapor"};
                   choice = JOptionPane.showOptionDialog(null, "Which of the following gasses is not released by the leaves of a plant?",
                           null, JOptionPane.DEFAULT_OPTION, 0, null,
                           buttons2, null);
                   if (choice == 0) {
                       JOptionPane.showMessageDialog(null, "Correct!");
                   }
                   if (choice == 1) {
                       JOptionPane.showMessageDialog(null, "Incorrect");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
               }
               else if(aaa == 3) {
                   JOptionPane.showMessageDialog(null, "You got a hard question in Bio ");
                   String[] buttons3 = {"Birds ", "Fish"};
                   choice = JOptionPane.showOptionDialog(null, "Bone marrow does not occur in _",
                           null, JOptionPane.DEFAULT_OPTION, 0, null,
                           buttons3, null);
                   if (choice == 0) {
                       JOptionPane.showMessageDialog(null, "Correct!");
                   }
                   if (choice == 1) {
                       JOptionPane.showMessageDialog(null, "You got the question wrong and got stuffed in a locker");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
               }
           }
































































































           JOptionPane.showMessageDialog(null, "Next class: " + P2);
           if (b == 1) {
































































               int bb = (int) (Math.random() * 4 + 1);
               if (bb == 1) {
                   String bbb = JOptionPane.showInputDialog(null, "f(x)=x+5^2\n" + "what is f(x) if x = 5?");
                   int bans = Integer.parseInt(bbb);
                   if (bans == 30) {
                       JOptionPane.showMessageDialog(null, "correct");
                   } else {
                       JOptionPane.showMessageDialog(null, "No");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
               } else if (bb == 2) {
                   String bbbb = JOptionPane.showInputDialog(null, "f(x)= x+5^3\n" + "what is f(x) if x = 5?");
                   int bans = Integer.parseInt(bbbb);
                   if (bans == 130) {
                       JOptionPane.showMessageDialog(null, "correct");
                   } else {
                       JOptionPane.showMessageDialog(null, "No");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
               } else {
                   String bbbbb = JOptionPane.showInputDialog(null, "f(x)= x+6^3\n" + "what is f(x) if x = 5");
                   int bans = Integer.parseInt(bbbbb);
                   if (bans == 222) {
                       JOptionPane.showMessageDialog(null, "correct");
                   } else {
                       JOptionPane.showMessageDialog(null, "No");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
               }
           }
































































           else {








               int bbbbbb = (int) (Math.random() * 3 + 1);
               if (bbbbbb == 1) {
                   String _7b = JOptionPane.showInputDialog(null, "x=5+1" + "what is x");
                   int bans = Integer.parseInt(_7b);
                   if (bans == 6) {
                       JOptionPane.showMessageDialog(null, "correct");
                   } else {
                       JOptionPane.showMessageDialog(null, "No");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
               } else if (bbbbbb == 2) {
                   String _8b = JOptionPane.showInputDialog(null, "x+5=20\n" + "what is x?");
                   int bans = Integer.parseInt(_8b);
                   if (bans == 15) {
                       JOptionPane.showMessageDialog(null, "correct");
                   } else {
                       JOptionPane.showMessageDialog(null, "No");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
               } else {
                   String _9b = JOptionPane.showInputDialog(null, "x+10=200\n" + "what is x?");
                   int bans = Integer.parseInt(_9b);
                   if (bans == 190) {
                       JOptionPane.showMessageDialog(null, "correct");
                   } else {
                       JOptionPane.showMessageDialog(null, "No");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
               }
           }
















































































































           JOptionPane.showMessageDialog(null, "Next class: " + P3);
           if (c == 1) {
































































               int cc = (int) (Math.random() * 4 + 1);
               if (cc == 1) {
                   String ccc = JOptionPane.showInputDialog(null, "True or false: Chat GPT is the most popular IDE for the use of Python\n" + "type 1 for true, type 2 for false");
                   int cans = Integer.parseInt(ccc);
                   if (cans == 2) {
                       JOptionPane.showMessageDialog(null, "correct");
                   } else {
                       JOptionPane.showMessageDialog(null, "No");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
               } else if (cc == 2) {
                   String cccc = JOptionPane.showInputDialog(null, "True or false: java frameworks help with application development?\n" + "type 1 for true, type 2 for false");
                   int cans = Integer.parseInt(cccc);
                   if (cans == 1) {
                       JOptionPane.showMessageDialog(null, "correct");
                   } else {
                       JOptionPane.showMessageDialog(null, "No");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
               } else {
                   String ccccc = JOptionPane.showInputDialog(null, "True or false: java.util.ArrayList; is a common import statement for JavaScript\n"+"type 1 for true, type 2 for false");
                   int cans = Integer.parseInt(ccccc);
                   if (cans == 2) {
                       JOptionPane.showMessageDialog(null, "correct");
                   } else {
                       JOptionPane.showMessageDialog(null, "No");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
               }
           }
































































           else {
               int cccccc = (int) (Math.random() * 3 + 1);
               if (cccccc == 1) {
                   String _7c = JOptionPane.showInputDialog(null, "Does JOptionPane provide graphics or a popup?\n" + "type 1 for graphics, type 2 for popup");
                   int cans = Integer.parseInt(_7c);
                   if (cans == 2) {
                       JOptionPane.showMessageDialog(null, "correct");
                   } else {
                       JOptionPane.showMessageDialog(null, "No");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
               } else if (cccccc == 2) {
                   String _8c = JOptionPane.showInputDialog(null, "you MUST have an import statement if you want to have popups\n"+"type 1 for true, type 2 for false");
                   int cans = Integer.parseInt(_8c);
                   if (cans == 1) {
                       JOptionPane.showMessageDialog(null, "correct");
                   } else {
                       JOptionPane.showMessageDialog(null, "No");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
               } else {
                   String _9c = JOptionPane.showInputDialog(null, "True or false: The scanner system will not provide you with a popup\n" + "type 1 for true, type 2 for false");
                   int cans = Integer.parseInt(_9c);
                   if (cans == 1) {
                       JOptionPane.showMessageDialog(null, "correct");
                   } else {
                       JOptionPane.showMessageDialog(null, "No");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
               }
           }
































































































































































































           JOptionPane.showMessageDialog(null, "Next class: " + P4);
           if (d == 1) {
































































               int dd = (int) (Math.random() * 4 + 1);
               if (dd == 1) {
                   String ddd = JOptionPane.showInputDialog(null, "what is 100000 dollars after income taxes in California? Round to the nearest thousand\n"+"(type your answer in only numbers with no commas)");
                   int dans = Integer.parseInt(ddd);
                   if (dans == 70000) {
                       JOptionPane.showMessageDialog(null, "correct");
                   } else {
                       JOptionPane.showMessageDialog(null, "No");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
               } else if (dd == 2) {
                   String dddd = JOptionPane.showInputDialog(null, "Which of the following states have no sales tax?\n" + "type 1 for California, type 2 for Oregon, type 3 for Utah, type 4 for Nevada");
                   int dans = Integer.parseInt(dddd);
                   if (dans == 2) {
                       JOptionPane.showMessageDialog(null, "correct");
                   } else {
                       JOptionPane.showMessageDialog(null, "No");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
               } else {
                   String ddddd = JOptionPane.showInputDialog(null, "Which of the following countries has the largest economy?\n" + "type 1 for Kuwait, type 2 for China, type 3 for Saudi Arabia, type 4 for the United States.");
                   int dans = Integer.parseInt(ddddd);
                   if (dans == 4) {
                       JOptionPane.showMessageDialog(null, "correct");
                   } else {
                       JOptionPane.showMessageDialog(null, "No");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
               }
           }
































































           else {








               int dddddd = (int) (Math.random() * 3 + 1);
               if (dddddd == 1) {
                   String _7d = JOptionPane.showInputDialog(null, "What year did World War 2 end?");
                   int dans = Integer.parseInt(_7d);
                   if (dans == 1945) {
                       JOptionPane.showMessageDialog(null, "correct");
                   } else {
                       JOptionPane.showMessageDialog(null, "No");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
               } else if (dddddd == 2) {
                   String _8d = JOptionPane.showInputDialog(null, "What year did World War 1 end?");
                   int dans = Integer.parseInt(_8d);
                   if (dans == 1918) {
                       JOptionPane.showMessageDialog(null, "correct");
                   } else {
                       JOptionPane.showMessageDialog(null, "No");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
               } else {
                   String _9d = JOptionPane.showInputDialog(null, "What year did the United States gain independence?");
                   int dans = Integer.parseInt(_9d);
                   if (dans == 1776) {
                       JOptionPane.showMessageDialog(null, "correct");
                   } else {
                       JOptionPane.showMessageDialog(null, "No");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
               }
           }
// add P5 and P6
































































































           if (e == 1) {
               int ee = (int) (Math.random() * 2 + 1);
               if (ee == 1) {
                   JOptionPane.showMessageDialog(null, "You got a hard question in Ap Japanese");
                   String[] buttons4 = {"Odoru", "Kiru"};
                   choice = JOptionPane.showOptionDialog(null, " How to say - To wear In japanese ",
                           null, JOptionPane.DEFAULT_OPTION, 0, null,
                           buttons4, null);
                   if (choice == 0) {
                       JOptionPane.showMessageDialog(null, "You got the question wrong and got stuffed in a locker");
                       health = health - 20;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
                   if (choice == 1) {
                       JOptionPane.showMessageDialog(null, "Correct!");
                   }
               }
               else  {
                   JOptionPane.showMessageDialog(null, "You got no hard questions in Ap Japanese");
               }}
           else  {
               int eee = (int) (Math.random() * 3 + 1);
               if (eee == 1) {
                   JOptionPane.showMessageDialog(null, "You got a question in Spanish");
                   String[] buttons5 = {"To sing", " To be"};
                   choice = JOptionPane.showOptionDialog(null, "What does Ser mean",
                           null, JOptionPane.DEFAULT_OPTION, 0, null,
                           buttons5, null);
                   if (choice == 0) {
                       JOptionPane.showMessageDialog(null, "You got the question wrong and got stuffed in a locker");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
                   if (choice == 1) {
                       JOptionPane.showMessageDialog(null, "Correct!");
                   }
               }
               else if (eee == 2) {
                   JOptionPane.showMessageDialog(null, "You got a question in spanish");
                   String[] buttons6 = {"To sing", "To dance"};
                   choice = JOptionPane.showOptionDialog(null, "What does Cantar mean",
                           null, JOptionPane.DEFAULT_OPTION, 0, null,
                           buttons6, null);
                   if (choice == 0) {
                       JOptionPane.showMessageDialog(null, "Correct!");
                   }
                   if (choice == 1) {
                       JOptionPane.showMessageDialog(null, "That is incorrect");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
               }
               else {
                   JOptionPane.showMessageDialog(null, "You got no hard questions in spanish ");
               }
           }
































































//period 6
           if (f == 1) {
               int ff = (int) (Math.random() * 2 + 1);
               if (ff == 1) {
                   JOptionPane.showMessageDialog(null, "You got a hard question in Wind Ensemble");
                   String[] buttons7 = {"Air speed", "Embouchure"};
                   choice = JOptionPane.showOptionDialog(null, "Which of the following best changes tone",
                           null, JOptionPane.DEFAULT_OPTION, 0, null,
                           buttons7, null);
                   if (choice == 0) {
                       JOptionPane.showMessageDialog(null, "You got the question wrong and got stuffed in a locker");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
                   if (choice == 1) {
                       JOptionPane.showMessageDialog(null, "Correct!");
                   }
               }
               else {
                   JOptionPane.showMessageDialog(null, "You got no questions in Wind Ensemble");
               }}
           else  {
               int fff = (int) (Math.random() * 3 + 1);
               if (fff == 1) {
                   JOptionPane.showMessageDialog(null, "You got a hard question in Concert Band");
                   String[] buttons8 = {"E#", "F"};
                   choice = JOptionPane.showOptionDialog(null, "What is the standard form of the following note?",
                           null, JOptionPane.DEFAULT_OPTION, 0, null,
                           buttons8, null);
                   if (choice == 0) {
                       JOptionPane.showMessageDialog(null, "You got the question wrong and got stuffed in a locker");
                       health = health - 10;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
                   if (choice == 1) {
                       JOptionPane.showMessageDialog(null, "Correct!");
                   }
               }
               else if (fff == 2) {
                   JOptionPane.showMessageDialog(null, "You got a hard question in Concert Band");
                   String[] buttons9 = {"Bb", "C"};
                   choice = JOptionPane.showOptionDialog(null, "What key is a trumpet in?",
                           null, JOptionPane.DEFAULT_OPTION, 0, null,
                           buttons9, null);
                   if (choice == 0) {
                       JOptionPane.showMessageDialog(null, "Correct!");
                   }
                   if (choice == 1) {
                       JOptionPane.showMessageDialog(null, "A clarinet impaled your head");
                       health = health - 30;
                       JOptionPane.showMessageDialog(null, "Health = " + health);
                   }
               }
               else  {
                   JOptionPane.showMessageDialog(null, "You got no hard problems in Concert Band ");
               }
           }
































































































































































































           int RandomMoney = (int) (Math.random() * 8 + 1);
           if (RandomMoney == 1) {
               JOptionPane.showMessageDialog(null, " Your parents gave you money");
               coins = coins + 5;
               JOptionPane.showMessageDialog(null, "Coins = " + coins);
           } else {
               JOptionPane.showMessageDialog(null, " Your parents did not give you money");
               JOptionPane.showMessageDialog(null, " Coins = " + coins);
           }
































































           // Shop
           if (coins >= 9) {
               JOptionPane.showMessageDialog(null, "You have enough money to buy food and regen health");
               String[] buttons10 = {"Buy food", "Don't buy food"};
               choice = JOptionPane.showOptionDialog(null, "Do you want to buy food?",
                       null, JOptionPane.DEFAULT_OPTION, 0, null,
                       buttons10, null);
               if (choice == 0) {
                   coins = coins - 10;
                   health = health + 15;
                   if (health >= 100) {
                       health = 100; // Clamp health to 100 if it goes above
                   }
               }
           } else {
               JOptionPane.showMessageDialog(null, "You don't have enough coins to buy food.");
           }
       }
       JOptionPane.showMessageDialog(null, "You have gained mental instability and unalived yourself in front of your mom.");
       JOptionPane.showMessageDialog(null, "You Survived " + day + " Days");
   }
}



















