public class Main {
        public static void main(String args[]){

        Hero hero1=new Hero("Дед", 64, "человек", "уже седой", ". Могу сказать бабке что-нибудь спечь");
        Hero hero2=new Hero("Бабка","человек","уже седая", ". Могу испечь пирог");
        Hero hero3=new Hero("Колобок", "пирог", "румяный бок", ". Я от дедушки ушёл и от бабушки ушёл");
        Hero hero4=new Hero("Медведь", 9, ". Колобок, я тебя съем!");
        Hero hero5=new Hero("Волк", "род псовых", "серый бочок", ". Колобок, я тебя съем!");
        Hero hero6=new Hero("Заяц", 2, "грызун", "беляк", ". Колобок, я тебя съем!");
        Hero hero7=new Hero("Лиса", 4, ". Колобок, я тебя съем! Что-то стара я стала, не слышу!");

        hero1.say();
        hero2.say();
        hero3.say();
        hero4.say();
        hero5.say();
        hero6.say();
        hero7.say();

    }
}

