public class Test {
    public static void main(String[] args) {
        Planina pl1 = new Planina("Mount1", 100);
        Planina pl2 = new Planina("Mount2", 200);
        Planina pl3 = new Planina("Mount3", 400);
        Planina pl4 = new Planina("Mount4", 600);
        Planina pl5 = new Planina("Mount5", 800);
        Planina pl6 = new Planina("Mount6", 1000);

        Planina niska = new Planina("Niska", 259);
        Planina visoka = new Planina("Visoka", 2000);

        Planinar planinar = new Planinar(300, 50, pl1, pl2, pl3, pl4, pl5, pl6);
        System.out.println(planinar);

        System.out.println("===================================");

        planinar.popniSe(niska);
        System.out.println(planinar);

        System.out.println("===================================");

        planinar.popniSe(visoka);
        System.out.println(planinar);

        System.out.println("===================================");

        System.out.println(planinar.clanarina());

        System.out.println("===================================");

        System.out.println(planinar.sviUsponi());

        System.out.println("===================================");

        System.out.println(planinar.najvecaPlanina());

    }
}
