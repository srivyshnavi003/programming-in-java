import java.applet.Applet;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class QuizApplet extends Applet implements ActionListener {
    private String selectedCategory;
    private int score;
    private int currentQuestion;
    private String[] questions;
    private String[] answers;
    private Map<String, Integer> scoresMap;

    private Choice categoryChoice;
    private Button startButton;
    private Button submitButton;
    private Button hintButton;

    private Label feedbackLabel;

    public void init() {
        setLayout(null);

        categoryChoice = new Choice();
        categoryChoice.add("General Knowledge");
        categoryChoice.add("Science");
        categoryChoice.add("History");
        add(categoryChoice);

        startButton = new Button("Start Quiz");
        startButton.addActionListener(this);
        add(startButton);

        submitButton = new Button("Submit Answer");
        submitButton.addActionListener(this);
        add(submitButton);

        hintButton = new Button("Hint");
        hintButton.addActionListener(this);
        add(hintButton);

        feedbackLabel = new Label("");
        feedbackLabel.setBounds(20, 120, 400, 20);
        add(feedbackLabel);

        // Initialize questions and answers
        questions = new String[]{"Question 1?", "Question 2?", "Question 3?"};
        answers = new String[]{"Answer 1", "Answer 2", "Answer 3"};

        scoresMap = new HashMap<>();

        // Other initialization code
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            startQuiz();
        } else if (e.getSource() == submitButton) {
            submitAnswer();
        } else if (e.getSource() == hintButton) {
            provideHint();
        }
    }

    private void startQuiz() {
        selectedCategory = categoryChoice.getSelectedItem();
        score = 0;
        currentQuestion = 0;
        feedbackLabel.setText("");

        // Add code to fetch questions and answers based on the selected category

        // Other initialization code
    }

    private void submitAnswer() {
        String userAnswer = // Get the user's answer (e.g., from a text field or dialog box)

        if (userAnswer.equalsIgnoreCase(answers[currentQuestion])) {
            score += 10;
            feedbackLabel.setText("Correct! Current Score: " + score);
        } else {
            feedbackLabel.setText("Incorrect. The correct answer is: " + answers[currentQuestion]);
        }

        // Move to the next question or end the quiz if all questions are answered

        // Other code for handling quiz progress
    }

    private void provideHint() {
        // Add code to provide a hint for the current question

        // Update UI to display the hint
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.PLAIN, 14));

        g.drawString("Category: " + selectedCategory, 20, 50);
        g.drawString("Question: " + questions[currentQuestion], 20, 70);
        g.drawString("Score: " + score, 20, 90);

        // Other drawing code
    }
}
