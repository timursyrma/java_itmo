## Домашнее задание 1

Простая CRUD база данных магазина:
Написать консольную программу, которая хранит и извлекает основную информацию о товарах: артикул, название, цена и количество.

Данные хранить в памяти.

Программа ждёт, пока пользователь введет в консоли команду.
После выполнения одной команды, ждёт следующую.
Если пользоваетль ввёл exit, программа завершается.

Пользователь может ввести 5 команд:

1) ```create $артикул $название $цена $количество```
    - добавить новый товар

2) ```read```
    - Вывести на экран список всех ранее добавленных товаров
      (всю информацию в виде таблицы)

3) ```update $артикул $название $цена $количество```
    - обновить информацию о товаре с заданным артикулом

4) ```delete $артикул```
    - удалить заданный товар из БД

5) ```exit```
    - завершить программу

Обязательные требования:
 - Артикул должен быть уникальным. Можно добавить только один товар с одним артикулом.
 - Артикул может содержать только цифры и латинские буквы в Upper Case

Опционально:
 - Название может состоять из нескольких слов (через пробел) в кавычках.
