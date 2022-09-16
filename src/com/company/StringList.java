package com.company;

import java.util.ArrayList;
import java.util.List;

public class StringList {

    private final List<String> result = new ArrayList<>();

    // Добавление элемента.
    // Вернуть добавленный элемент в качестве результата выполнения.
    public String addStringAddReturnResult(String item) {
        result.add(item);
        return item;
    }

    // Добавление элемента на определенную позицию списка.
    // Если выходит за пределы фактического количества элементов или массива, выбросить исключение.
    // Вернуть добавленный элемент в качестве результата выполнения.
    public String addStringOfPozitionAddReturnResult(int index, String item) {
        if (index > result.size()){
            throw new RuntimeException("выходит за пределы фактического количества элементов");
        }
        result.add(index, item);
        return item;
    }

    // Установить элемент на определенную позицию, затерев существующий.
    // Выбросить исключение, если индекс больше фактического количества элементов или выходит за пределы массива.
    public void setStringOfPozition(int index, String item) {
        if (index >= result.size()){
            throw new RuntimeException("выходит за пределы фактического количества элементов");
        }
        result.set(index, item);
    }

    // Удаление элемента.
    // Вернуть удаленный элемент или исключение, если подобный элемент отсутствует в списке.
    public String removeStringOnValue(String item) {
        if (!result.contains(item)){
            throw new RuntimeException("подобный элемент отсутствует в списке");
        }
        result.remove(item);
        return item;
    }

    // Удаление элемента по индексу.
    // Вернуть удаленный элемент или исключение, если подобный элемент отсутствует в списке.
    public String removeStringOnIndex(int index) {
        if (index >= result.size()){
            throw new RuntimeException("подобный элемент отсутствует в списке");
        }
        String item = result.get(index);
        result.remove(index);
        return item;
    }

    // Проверка на существование элемента. Вернуть true/false
    public boolean checkingExistenceOfElement(String item) {
        return result.contains(item);
    }

    // Поиск элемента.
    // Вернуть индекс элемента или -1 в случае отсутствия.
    public int findIndexElement(String item) {
        if (checkingExistenceOfElement(item)){
            return result.indexOf(item);
        } else {
            return -1;
        }
    }

    // Поиск элемента с конца.
    // Вернуть индекс элемента или -1 в случае отсутствия.
    public int findIndexElementOnEnd(String item) {
        if (checkingExistenceOfElement(item)){
            return result.lastIndexOf(item);
        } else {
            return -1;
        }
    }


    // Получить элемент по индексу.
    // Вернуть элемент или исключение, если выходит за рамки фактического количества элементов.
    public String getStringOnIndex(int index) {
        if (index >= result.size()){
            throw new RuntimeException("выходит за рамки фактического количества элементов");
        }
        return result.get(index);
    }

    // Сравнить текущий список с другим.
    // Вернуть true/false или исключение, если передан null.
    public boolean equalsStringList(ArrayList<String> otherList) {
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
    public List<String> createNewStringList() {
        return new ArrayList<>(result);
    }

}
