package org.netology;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Начало фильтрации.");
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) < treshold) {
                logger.log("Элемент \"" + source.get(i) + "\" подходит.");
                result.add(source.get(i));
            } else {
                logger.log("Элемент \"" + source.get(i) + "\" не подходит.");
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size() + ".");
        return result;
    }
}