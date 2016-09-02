package _2_ForClasses;


public class A8_Stack {

    int[] stck = new int[10];
    int ver;

    A8_Stack() {
        //Присвоим переменной VER вершину стэка
        ver = -1;
    }

    // размещаем елемент в стеке
    void push(int item) {
        if (ver == 9) { // или stck.length
            System.out.println("Stack заполнен");
        } else {
            stck[++ver] = item;
        }
    }

    //Выгрузить Stack
    int pop() {
        if (ver < 0) {
            System.out.println("Stack не загружен");
            return 0;
        } else
            return stck[ver--];
    }

     public static void main(String[] args) {


        A8_Stack myStack = new A8_Stack();

        System.out.println("Заполнение Stack'a ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            myStack.push(i);
        }

        System.out.println("\nВыгрузка Stack's");
        for (int i = 0; i < 10; i++) {
            System.out.print(myStack.pop() + " ");
        }



    }
}
