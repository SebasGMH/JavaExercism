public class Twofer {
    public String twofer(String name) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        // will use a switch to give it a nice structure

        // will add case for no name at first
        if (name == null){
            return "One for you, one for me.";
        }
        switch (name){
            case "Do-yun":
                return "One for Do-yun, one for me.";

            default:
                String friend = "One for " + name + ", one for me.";
                return friend;
        }

    }
}
