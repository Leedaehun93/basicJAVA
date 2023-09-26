package chap12.sec01.verify.exam06;

/**
 * packageName : chap12.sec01.verify.exam06
 * fileName : Qna
 * author : kangtaegyung
 * date : 2023/04/06
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/04/06         kangtaegyung          최초 생성
 */
public class Qna {
    private int qno;
    private String question;
    private String questioner;
    private String answer;
    private String answerer;

    public Qna(int qno, String question, String questioner, String answer, String answerer) {
        this.qno = qno;
        this.question = question;
        this.questioner = questioner;
        this.answer = answer;
        this.answerer = answerer;
    }

    public int getQno() {
        return qno;
    }

    public String getQuestion() {
        return question;
    }

    public String getQuestioner() {
        return questioner;
    }

    public String getAnswer() {
        return answer;
    }

    public String getAnswerer() {
        return answerer;
    }

    @Override
    public String toString() {
        return "Qna{" +
                "qno=" + qno +
                ", question='" + question + '\'' +
                ", questioner='" + questioner + '\'' +
                ", answer='" + answer + '\'' +
                ", answerer='" + answerer + '\'' +
                '}';
    }
}
