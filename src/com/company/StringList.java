package com.company;

import java.util.ArrayList;
import java.util.List;

public class StringList {

    private final List<Integer> result = new ArrayList<>();

    // Добавление элемента.
    // Вернуть добавленный элемент в качестве результата выполнения.
    public Integer addStringAddReturnResult(Integer item) {
        result.add(item);
        return item;
    }

    // Добавление элемента на определенную позицию списка.
    // Если выходит за пределы фактического количества элементов или массива, выбросить исключение.
    // Вернуть добавленный элемент в качестве результата выполнения.
    public Integer addStringOfPozitionAddReturnResult(int index, Integer item) {
        if (index > result.size()){
            throw new RuntimeException("выходит за пределы фактического количества элементов");
        }
        result.add(index, item);
        return item;
    }

    // Установить элемент на определенную позицию, затерев существующий.
    // Выбросить исключение, если индекс больше фактического количества элементов или выходит за пределы массива.
    public void setStringOfPozition(int index, Integer item) {
        if (index >= result.size()){
            throw new RuntimeException("выходит за пределы фактического количества элементов");
        }
        result.set(index, item);
    }

    // Удаление элемента.
    // Вернуть удаленный элемент или исключение, если подобный элемент отсутствует в списке.
    public Integer removeStringOnValue(Integer item) {
        if (!result.contains(item)){
            throw new RuntimeException("подобный элемент отсутствует в списке");
        }
        result.remove(item);
        return item;
    }

    // Удаление элемента по индексу.
    // Вернуть удаленный элемент или исключение, если подобный элемент отсутствует в списке.
    public Integer removeStringOnIndex(int index) {
        if (index >= result.size()){
            throw new RuntimeException("подобный элемент отсутствует в списке");
        }
        Integer item = result.get(index);
        result.remove(index);
        return item;
    }

    // Проверка на существование элемента. Вернуть true/false
    public boolean checkingExistenceOfElement(Integer item) {
        return result.contains(item);
    }

    // Поиск элемента.
    // Вернуть индекс элемента или -1 в случае отсутствия.
    public int findIndexElement(Integer item) {
        if (checkingExistenceOfElement(item)){
            return result.indexOf(item);
        } else {
            return -1;
        }
    }

    // Поиск элемента с конца.
    // Вернуть индекс элемента или -1 в случае отсутствия.
    public int findIndexElementOnEnd(Integer item) {
        if (checkingExistenceOfElement(item)){
            return result.lastIndexOf(item);
        } else {
            return -1;
        }
    }


    // Получить элемент по индексу.
    // Вернуть элемент или исключение, если выходит за рамки фактического количества элементов.
    public Integer getStringOnIndex(int index) {
        if (index >= result.size()){
            throw new RuntimeException("выходит за рамки фактического количества элементов");
        }
        return result.get(index);
    }

    // Сравнить текущий список с другим.
    // Вернуть true/false или исключение, если передан null.
    public boolean equalsStringList(ArrayList<Integer> otherList) {
        if (otherList == null){
            throw new RuntimeException("передан null");
        } else {
            return result.equals(otherList);
        }
    }

    // Вернуть фактическое количество элементов.
    public int sizeStringList() {
        return result.size();
    }

    // Вернуть true, если элементов в списке нет, иначе false.
    public boolean sizeIsEmpty() {
        return result.isEmpty();
    }

    // Удалить все элементы из списка.
    public void clearStringList() {
        result.clear();
    }

    // Создать новый массив из строк в списке и вернуть его.
    public List<Integer> createNewStringList() {
        return new ArrayList<>(result);
    }

    // Пузырьковая сортировка. Сортирует где-то 39-40 секунд
    public static void sortBubble(List<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size() - 1 - i; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    Integer m = arr.get(j);
                    Integer n = arr.get(j + 1);
                    arr.set(j, n);
                    arr.set(j + 1, m);
                }
            }
        }
    }

    // Сортировка выбором. Сортирует где-то 11-12 секунд
    public static void sortSelection(List<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) < arr.get(minElementIndex)) {
                    minElementIndex = j;
                }
            }
            Integer m = arr.get(minElementIndex);
            Integer n = arr.get(i);
            arr.set(minElementIndex, n);
            arr.set(i, m);
        }
    }

    // Сортировка вставкой. Сортирует где-то 10-11 секунд
    public static void sortInsertion(List<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            int temp = arr.get(i);
            int j = i;
            while (j > 0 && arr.get(j - 1) >= temp) {
                  Integer n = arr.get(j - 1);
                arr.set(j, n);
                j --;
            }
            arr.set(j, temp);
        }
    }

    // Бинарный поиск
    private static boolean contains(List<Integer> arr, int element) {
        sortInsertion(arr);
        int min = 0;
        int max = arr.size() - 1;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (element == arr.get(mid)) {
                return true;
            }

            if (element < arr.get(mid)) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }

}
