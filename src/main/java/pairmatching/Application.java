package pairmatching;

import pairmatching.controller.MatchingController;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행

        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        MatchingController matchingController = new MatchingController(inputView, outputView);

        matchingController.run();
    }
}
