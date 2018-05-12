package com.example.aluno.calculadora.banco;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by aluno on 11/05/18.
 */

public class BDCore extends SQLiteOpenHelper {

    private final static String NOME_BANCO="financeiro";
    private final static Integer VERSAO_BANCO=1;

    public BDCore(Context context){
        super(context, NOME_BANCO, null, VERSAO_BANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table calculo(id integer primary key " +
                "autoincrement, " +
                "descricao varchar(200)," +
                "tipo_lancamento varchar(100)," +
                "valor real);");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table lancamentos");
        onCreate(db);
    }
}
