package hanghae99.week2;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String collection;
        String title = "";
        String recipe = "";

        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Map<Integer, String> map = new HashMap<>();
        do{
            System.out.print("저장할 자료구조를 입력하세요 : ");
            collection = sc.nextLine().toLowerCase();
        }while (!collection.equals("list") && !collection.equals("set") && !collection.equals("map"));

        title = inputTitle(sc);
        // 끝이 입력될 떄까지 반복
        while(true) {
            recipe = inputRecipe(sc);
            if(recipe.equals("끝")) break;
            switch (collection) {
                case "list":
                    list.add(recipe);
                    break;
                case "set":
                    set.add(recipe);
                    break;
                case "map":
                    map.put(map.size() + 1, recipe);
                    break;
            }
        }

        System.out.println("[" + title + "]");
        switch (collection) {
            case "list":
                int i = 1;
                for (String s : list) {
                    System.out.println(i + ". " + s);
                    i++;
                }
                break;
            case "set":
                i = 1;
                for (String s : set) {
                    System.out.println(i + ". " + s);
                    i++;
                }
                break;
            case "map":
                for (int key : map.keySet()) {
                    System.out.println(key + ". " + map.get(key));
                }
                break;
        }
    }

    static String inputTitle(Scanner sc) {
        System.out.println("내가 좋아하는 요리 제목을 입력하세요.");
        System.out.print("요리 제목 : ");
        return sc.nextLine();
    }

    static String inputRecipe(Scanner sc) {
        System.out.print("레시피를 입력하세요. - ( 입력을 마쳤으면 '끝'을 입력하세요. ): ");
        return sc.nextLine();
    }
}
