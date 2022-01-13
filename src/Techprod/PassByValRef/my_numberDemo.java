package Techprod.PassByValRef;

class my_numberDemo {

        public static void main (String [] args){

            my_number object = new my_number();// creating object

            System.out.println("number = " + object.number);// printing before update

            update(object); // update function called.

            System.out.println("number = " + object.number); //printing after update.
        }

        public static void update( my_number obj ){// increments number variable.

            obj.number++;
        }
    }


//    Common mistakes with object references
//    Trying to change an immutable value by reference.
//    Trying to change a primitive variable by reference.
//    Expecting the real object won't change when you change a mutable object parameter in a method.
//    What to remember about object references
//    Java always passes parameter variables by value.
//    Object variables in Java always point to the real object in the memory heap.
//    A mutable object’s value can be changed when it is passed to a method.
//    An immutable object’s value cannot be changed, even if it is passed a new value.
//“Passing by value” refers to passing a copy of the value.
//            “Passing by reference” refers to passing the real reference of the variable in memory.

