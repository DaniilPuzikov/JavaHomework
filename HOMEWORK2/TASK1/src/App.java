// 1) Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}


import java.util.Scanner;

import org.json.simple.JSONObject;

public class App {
    public static void main(String[] args) {
        JSONObject Filt = new JSONObject();
        Filt.put("name","Ivanov");
        Filt.put("country","Russia");
        Filt.put("city","Moscow");
        Filt.put("age",null);
        StringBuilder SQL = new StringBuilder();

        SQL.append("SELECT * FROM students WHERE ");
        SQL.append("name = ");
        SQL.append(Filt.get("name"));
        SQL.append(" AND ");
        SQL.append("country = ");
        SQL.append(Filt.get("country"));
        SQL.append(" AND ");
        SQL.append("city = ");
        SQL.append(Filt.get("city"));
        System.out.println(SQL.toString());
    }
}
