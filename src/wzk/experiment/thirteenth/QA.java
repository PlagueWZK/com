package wzk.experiment.third;

/**
 * @author PlagueWZK
 * description: Solution
 * date: 2025/1/2 20:53
 */

import java.util.*;

public class QA {
    public static void main(String[] args) {
        Map<String, String> questionAnswerMap = new LinkedHashMap<>();
        questionAnswerMap.put("Java 的创始人是谁？", "詹姆斯·高斯林");
        questionAnswerMap.put("Java 是面向对象的语言吗？", "是");
        questionAnswerMap.put("JVM 的全称是什么？", "Java Virtual Machine");
        questionAnswerMap.put("Java 中的关键字 'final' 的含义是什么？", "不可更改");


        System.out.println("题目和答案如下：");
        Iterator<Map.Entry<String, String>> iterator = questionAnswerMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("题目：" + entry.getKey());
            System.out.println("答案：" + entry.getValue());
            System.out.println("-------------------------");
        }
    }
}
