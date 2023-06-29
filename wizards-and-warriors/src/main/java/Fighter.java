abstract class Fighter {

    boolean isVulnerable() {
        // throw new UnsupportedOperationException("Please provide implementation for this method");
        return false;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        //throw new UnsupportedOperationException("Please implement the toString() method with the required text");
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {
        //throw new UnsupportedOperationException("Please implement Warrior.damagePoints() method");
        return wizard.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {
    private boolean prepared = false;

    public String toString() {
        //throw new UnsupportedOperationException("Please implement the toString() method with the required text");
        return "Fighter is a Wizard";
    }

    @Override
    boolean isVulnerable() {
        //throw new UnsupportedOperationException("Please implement Wizard.isVulnerable() method");
        return !prepared;
    }

    @Override
    int damagePoints(Fighter warrior) {
        //throw new UnsupportedOperationException("Please implement Wizard.damagePoints() method");
        return prepared ? 12 : 3;
    }

    void prepareSpell() {
        //throw new UnsupportedOperationException("Please implement Wizard.prepareSpell() method");
        prepared = true;
    }

}
