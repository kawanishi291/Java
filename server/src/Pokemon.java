class Pokemon {
    String name;
    String type1;
    String type2;
    int level;
    int hp;
    int atk;
    int def;
    int agl;

    void Setname(String n) {
        this.name = n;
    }
    void Settype(String one, String two) {
        this.type1 = one;
        this.type2 = two;
    }
    void Setstatus(int l, int hp, int atk, int def, int agl) {
        this.level = l;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.agl = agl;
    }
    void Print() {
        System.out.println("Name:" + this.name);
        if(this.type2 != null)
            System.out.println("type:" + this.type1 + "," + type2);
        else
            System.out.println("type:" + this.type1);
        System.out.println("Level." + this.level);
        System.out.print("HP:" + this.hp + "\t");
        System.out.print("ATK:" + this.atk + "\n");
        System.out.print("DEF:" + this.def + "\t");
        System.out.println("AGL:" + this.agl + "\n");
    }
}

class MyPokemon {
    public static void main(String[] args) {
        Pokemon monster1 = new Pokemon();
        monster1.Setname("ピカチュウ");
        monster1.Settype("でんき", null);
        monster1.Setstatus(10, 30, 9, 8, 12);
        monster1.Print();

        Pokemon monster2 = new Pokemon();
        monster2.Setname("ハッサム");
        monster2.Settype("むし", "はがね");
        monster2.Setstatus(31, 97, 56, 38, 49);
        monster2.Print();
    }
}