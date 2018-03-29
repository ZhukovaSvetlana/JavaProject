public enum Rank {
    ENGINEER("Инженер"),
    TESTER("Тестировщик"),
    DIRECTOR("Директор");

    Rank(String name){
        this.name = name;
    }

    private String name;

    public String getName(){
        return name;
    }

    public static boolean isRankExist(String rankName){
        for (Rank element: values()){
            if (rankName.equals(element.getName())){
                return true;
            }
        }
        return false;
    }

    public static Rank getRank(String rankName){
        for (Rank element: values()){
            if (rankName.equals((element.getName()))){
                return element;
            }
        }
        return null;
    }
}
