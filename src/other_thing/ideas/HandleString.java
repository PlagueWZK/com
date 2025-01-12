package other_thing.ideas;

public class HandleString {
    public static void main(String[] args) {

        Person.takeInPersons(Person.strS);
        for (Person person : Person.persons) {
            System.out.println(person.toString());
        }

    }

    public static int CountOfString(String str, String sub) {
        int count = 0, index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

}

class Person {
    public String name;
    public int count;
    public int rank;

    public Person(String name) {
        this.name = name;
        this.count = HandleString.CountOfString(str, name);
    }

    public static void sort(Person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - i - 1; j++) {
                if (persons[j].count < persons[j + 1].count) {
                    Person temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
    }
    public static String[] strS = {"宋俊浩", "孙光浩", "孙嘉豪", "王瑜", "王政凯", "王梓昊", "魏来", "吴宝宽",
            "徐博林", "王家栋", "王天赐", "吴喆媛", "王焱琪", "王泽浩", "王尚祥", "宋双良", "孙如雪", "武显恒",
            "王忠睿","王鑫凯","沈治华","宋震宇","徐寒", "沈雅琳", "王蕴涵","田承龙"};
    public static Person[] persons = new Person[strS.length];

    public static void takeInPersons(String[] strS) {
        for (int i = 0; i < strS.length; i++) {
            persons[i] = new Person(strS[i]);
        }
        sort(persons);
        for (int i = 0; i < persons.length; i++) {
            persons[i].rank = i+1;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", rank=" + rank +
                '}';
    }

    public static final String str = """
            3.13 晚自习
            宋俊浩 孙光浩 孙嘉豪 王瑜 王政凯 王梓昊 魏来 吴宝宽 徐博林
            3.25 早自习
            宋俊浩 王家栋  王天赐 王政凯 王忠睿 魏来 吴宝宽 吴喆媛 徐博林 王焱琪
            3.27 晚自习
            王泽浩
            3.28  早自习
            王尚祥 王梓昊 徐博林
            3.29 早自习
            宋俊浩 宋双良 王天赐 王泽浩 徐博林
            3.31 晚自习
            王天赐 王瑜 王忠睿
            4.2 早自习\s
            徐博林
            4.3 早自习
            孙嘉豪 孙如雪 王尚祥 王瑜 王忠睿 王泽浩 徐博林
            4.7 早自习
            孙光浩 宋震宇
            4.7 晚自习
            王忠睿
            4.10 早自习
            孙嘉豪 王尚祥 王天赐 王瑜 王忠睿 王梓昊 徐博林
            4.10 晚自习
            王瑜 王家栋
            4.11 早自习
            王天赐 王焱琪 王忠睿 吴喆媛
            4.12 早自习
            王尚祥 王天赐 王梓昊
            4.12 晚自习
            王瑜，王梓昊，吴宝宽
            4.15 早自习
            孙嘉豪 王天赐 王泽浩 王忠睿 徐博林 王焱琪
            4.15 晚自习
            王瑜
            4.16 早自习
            王忠睿 王天赐
            4.17 早自习
            孙嘉豪 孙如雪 王尚祥 王天赐 王焱琪 王瑜  王忠睿 王梓昊 武显恒
            4.18 早自习
            宋双良 王泽浩 王天赐
            4.18 晚自习
            宋俊浩 王天赐 王瑜 王忠睿 王梓昊 吴宝宽
            4.19 早自习
            吴宝宽
            4.21 晚自习
            王瑜
            4.22 早自习
            宋双良、孙嘉豪、王尚祥、王天赐、王瑜、王鑫凯、王泽浩、王忠睿、魏来、徐博林
            4.22 晚自习
            王瑜
            4.23 早自习
            王瑜
            4.24 早自习
            王梓昊、王焱琪、孙嘉豪、孙如雪、王蕴涵、吴喆媛、王天赐、徐博林、王尚祥、王忠睿、王瑜
            4.28 晚自习
            孙嘉豪、魏来、徐博林、王瑜、王梓昊
            4.29 晚自习
            宋俊浩 王天赐 王忠睿 王瑜
            5.6 早自习
            宋双良、孙嘉豪、王家栋、王瑜、吴宝宽、王政凯、王忠睿、王梓豪、魏来、徐博林
            5.7 早自习
            宋俊浩 王天赐 王焱琪 王瑜 王忠睿 吴宝宽
            5.8 早自习
            沈治华 宋双良 孙光浩 孙嘉豪 王尚祥 王天赐 王梓昊 王忠睿 王泽浩 王瑜 王焱琪 徐博林
            5.9 早自习
            宋俊浩 王尚祥 王天赐 王焱琪 王忠睿 武显恒
            5.9 晚自习
            孙嘉豪 王瑜 魏来
            5.10 早自习
            宋俊浩 宋双良 孙嘉豪 王家栋 王尚祥 王天赐 王泽浩 王忠睿 徐博林
            5.12 晚自习
            孙嘉豪 孙如雪 王家栋 王天赐 王瑜 王忠睿 吴宝宽
            5.13 早自习
            宋俊浩 宋双良 孙嘉豪  王家栋 王尚祥 王天赐 王瑜 王泽浩 王政凯 王忠睿 王梓昊 魏来 吴宝宽 徐博林
            5.13 晚自习
            王天赐 王忠睿 徐博林 王梓昊 魏来
            5.14 早自习
             孙嘉豪 宋双良 王家栋 王尚祥 王天赐 王瑜 王泽浩 王政凯 王忠睿 魏来 吴宝宽 徐博林
            5.15 晚自习
            孙嘉豪、王瑜、王梓豪、魏来
            5.16 早自习
            宋俊浩 宋双良 孙嘉豪 王家栋 王尚祥 王天赐 王焱琪 王瑜 王泽浩 王忠睿 魏来 吴宝宽 吴喆媛 徐博林
            5.17 早自习
            宋俊浩 宋双良 孙嘉豪 王家栋 王尚祥 王天赐 王焱琪 王瑜  王忠睿 魏来 吴宝宽  徐博林
            5.19 晚自习
            孙嘉豪 王天赐 王焱琪 王瑜 王忠睿 吴宝宽
            5.20 早自习
            沈志华 宋俊浩 宋双良 孙光浩 孙嘉豪 王天赐 王鑫凯 王焱琪 王泽浩 王忠睿 魏来 武显恒 徐博林
            5.20 晚自习
            宋俊浩 王天赐 王忠睿 魏来 吴宝宽
            5.21 早自习
            宋俊浩 王天赐 王焱琪 王忠睿 吴宝宽 徐博林
            5.22 早自习
            沈雅琳 沈志华 宋双良 孙嘉豪 孙如雪 王尚祥 王天赐 王焱琪 王蕴涵  王泽浩 王忠睿 吴宝宽 徐博林
            5.22  晚自习
            宋俊浩 孙嘉豪 王瑜 王梓昊 徐博林
            5.23 早自习
            宋俊浩 宋双良 王尚祥 王天赐 王焱琪 王泽浩 王忠睿 魏来 徐博林
            5.23 晚自习
            孙嘉豪 魏来
            5.24 早自习
            孙嘉豪 王焱琪 魏来 徐博林 孙如雪
            """;
}
