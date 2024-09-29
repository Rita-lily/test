import java.util.*;

class Question {
    String question;
    String[] options;
    int answerIndex;

    Question(String question, String[] options, int answerIndex) {
        this.question = question;
        this.options = options;
        this.answerIndex = answerIndex;
    }
}

public class DrivingTestSimulator {
    private static List<Question> questionBank = new ArrayList<>();
    private static int score = 0;

    public static void main(String[] args) {
        loadQuestions();
        Scanner scanner = new Scanner(System.in);

        System.out.println("欢迎来到驾考宝典模拟考试！");

        for (int i = 0; i < questionBank.size(); i++) {
            Question q = questionBank.get(i);
            System.out.println("题目 " + (i + 1) + ": " + q.question);
            for (int j = 0; j < q.options.length; j++) {
                System.out.println((j + 1) + ": " + q.options[j]);
            }

            System.out.print("请输入你的答案 (1-" + q.options.length + "): ");
            int userAnswer = scanner.nextInt() - 1;

            if (userAnswer == q.answerIndex) {
                score++;
                System.out.println("回答正确！\n");
            } else {
                System.out.println("回答错误！正确答案是: " + q.options[q.answerIndex] + "\n");
            }
        }

        System.out.println("考试结束！你的得分是: " + score + "/" + questionBank.size());
        scanner.close();
    }

    private static void loadQuestions() {
        questionBank.add(new Question("红灯亮时应该怎么做？", 
                new String[]{"继续行驶", "停车", "加速通过"}, 1));
        questionBank.add(new Question("驾驶时遇到紧急情况，应该首先做什么？", 
                new String[]{"踩刹车", "鸣喇叭", "减速"}, 0));
        // 可以继续添加更多问题
    }
}
