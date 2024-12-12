package pairmatching.controller;

import java.util.function.Supplier;
import pairmatching.model.Option;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class MatchingController {

    private final InputView inputView;
    private final OutputView outputView;

    public MatchingController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        outputView.printOption();
        Option option = tryReadOption();
    }


    private Option tryReadOption() {
        return requestRead(() -> {
            String inputOption = inputView.readOption();
            return Option.of(inputOption);
        });
    }

    private <T> T requestRead(Supplier<T> supplier) {
        while (true) {
            try {
                return supplier.get();
            } catch (IllegalArgumentException exception) {
                outputView.printErrorMessage(exception.getMessage());
            }
        }
    }
}
