package com.example.teste;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SQLite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite);

        try {
            SQLiteDatabase bancoDeDados = openOrCreateDatabase("app", MODE_PRIVATE, null);

            bancoDeDados.execSQL("CREATE TABLE IF NOT EXISTS pessoas (id INTEGER PRIMARY KEY AUTOINCREMENT, nome VARCHAR, idade INT(3))");
            //bancoDeDados.execSQL("DROP TABLE IF EXISTS pessoas");

            //bancoDeDados.execSQL("INSERT INTO pessoas (nome, idade) VALUES ('Mariana', 18)");
            //bancoDeDados.execSQL("INSERT INTO pessoas (nome, idade) VALUES ('Mario', 23)");
            //bancoDeDados.execSQL("INSERT INTO pessoas (nome, idade) VALUES ('Ivan', 22)");
            //bancoDeDados.execSQL("INSERT INTO pessoas (nome, idade) VALUES ('José', 50)");

            //bancoDeDados.execSQL("UPDATE pessoas SET idade = 19, nome = 'Mariana Silva' WHERE id = 1");

            //bancoDeDados.execSQL("DELETE FROM pessoas WHERE id = 4");

            /*String select = "SELECT nome, idade FROM pessoas " +
                    "WHERE nome = 'Viana' AND idade = 30";*/

            /*String select = "SELECT nome, idade FROM pessoas " +
                    "WHERE idade >= 21 OR idade = 18";*/

            /*String select = "SELECT nome, idade FROM pessoas " +
                    "WHERE idade IN (18, 22)";*/

            /*String select = "SELECT nome, idade FROM pessoas " +
                    "WHERE idade BETWEEN 18 AND 35";*/

            /*String filtro = "an";
            String select = "SELECT nome, idade FROM pessoas " +
                    "WHERE nome LIKE '%" + filtro + "%'";*/

            /*String select = "SELECT nome, idade FROM pessoas " +
                    "WHERE idade >= 18 ORDER BY idade ASC";*/

            String select = "SELECT * FROM pessoas ";

            Cursor cursor = bancoDeDados.rawQuery(select, null);

            int indiceId = cursor.getColumnIndex("id");
            int indiceNome = cursor.getColumnIndex("nome");
            int indiceIdade = cursor.getColumnIndex("idade");

            cursor.moveToFirst();

            while (cursor != null) {
                String nome  = cursor.getString(indiceNome);
                String idade  = cursor.getString(indiceIdade);
                String id  = cursor.getString(indiceId);

                Log.i("RESULTADO - id: ", id + " / nome: " + nome + " / Idade: " + idade);

                cursor.moveToNext();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
