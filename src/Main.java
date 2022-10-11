public class Main {
    public static void main(String[] args){
        Author SergeyEsenin = new Author("Сергей", "Есенин");
        Author AleksandrPushkin = new Author("Александр","Пушкин");


        Book LukDub = new Book("У лукоморья дуб зелёный",AleksandrPushkin,1820);
        Book PismoKZhenshine = new Book("Письмо к женщине",SergeyEsenin,1924);

        System.out.println(LukDub);
        System.out.println(PismoKZhenshine);




    }

}
