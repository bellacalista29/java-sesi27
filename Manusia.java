abstract class Manusia {
    protected abstract void nyanyiLagu();
}

class Cowok extends Manusia {
    @Override
    protected void nyanyiLagu() {
        System.out.println("da du du di dam");
    };
}

class Cewek extends Manusia {
    @Override
    protected void nyanyiLagu() {
        System.out.println("du ri dam dam");
    }
}

