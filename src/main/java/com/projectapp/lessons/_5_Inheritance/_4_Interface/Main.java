package com.projectapp.lessons._5_Inheritance._4_Interface;


public class Main {
    public static void main(String[] args) {

//        A1_Call ob = new A1_Call();
//        ob.call(5);
//        ob.showSmg();

//      A1_InterfaceCallback ref = new A1_Call();
//      ref.call(6);


/**************************************************/

        A2_CallOfClient a2_client = new A2_Client();
        A2_Client client = new A2_Client();

        a2_client.call("Привет я Сергей! ");
        client.call("Привет а я Иван! ");

        a2_client = client;
        a2_client.call("А я Петя :D");

/**************************************************/

//        A4_ClassAndInnerInterface.A4_InnerInterface innerInterface = new A4_ClassInheritsInterface();
//
//        for (int i = 1; i < 10; i+=2) {
//            innerInterface.fun(i);
//        }



/**************************************************/

//        A5_NewStackClass stackClass = new A5_NewStackClass(6);
//        A5_NewStackClass stackClass2 = new A5_NewStackClass(15);
//
//        for (int i = 0; i < 6; i++) stackClass.push(i);
//        for (int i = 0; i < 15; i++) stackClass2.push(i);
//
//        System.out.println("Stack 1");
//        for (int i = 0; i < 6; i++) {
//            System.out.print(stackClass.pop() + " ");
//        }
//
//        System.out.println();
//
//        System.out.println("Stack 2");
//        for (int i = 0; i < 15; i++) {
//            System.out.print(stackClass2.pop() + " ");
//        }



/**************************************************/

//        A5_NewStackInterface refMyStack; //ссылка на интерфейс
//        A5_NewStackClass stackClass = new A5_NewStackClass(5); //фиксированный массив
//        A5_NewStackClass_2 stackClass_3 = new A5_NewStackClass_2(15); //динамический массив
//
//
//        refMyStack = stackClass;
//        for (int i = 0; i < 5; i++) refMyStack.push(i);
//
//        refMyStack = stackClass_3;
//        for (int i = 0; i < 35; i++) refMyStack.push(i); //в цикле число специально больше стека
//
//        refMyStack = stackClass;
//        System.out.println("Stack 1");
//        for (int i = 0; i < 5; i++) {
//            System.out.print(refMyStack.pop() + " ");
//        }
//
//        refMyStack = stackClass_3;
//        System.out.println("\nStack 2");
//        for (int i = 0; i < 35; i++) {
//            System.out.print(refMyStack.pop() + " ");
//        }

/**************************************************/


//        A6_VariableInInterfaceClass a6_variableInInterfaceClass = new A6_VariableInInterfaceClass();
//
//
//        System.out.println("Когда идем жарить шашлык?????");
//        answer(a6_variableInInterfaceClass.ask());




/**************************************************/

//        A7_ExtensionInterface_3 a7_extensionInterface_3 = new A7_ExtensionInterface_3();
//        a7_extensionInterface_3.myFun1();
//        a7_extensionInterface_3.myFun2();
//        a7_extensionInterface_3.myFun3();







/**************************************************/


//        A8_DefaultValueInInterface_Class a8_defaultValueInInterface_class = new A8_DefaultValueInInterface_Class();
//        a8_defaultValueInInterface_class.showMsg();
//
//        //Метод по умолчанию доступен без это переопределения в классе
//        a8_defaultValueInInterface_class.showMsg_2();
//
//        //Метод вернул значение по умолчанию из метода
//        int a = a8_defaultValueInInterface_class.returnValue();
//        System.out.println("Значение = " + a);
//









/**************************************************/













/**************************************************/















    }
}
