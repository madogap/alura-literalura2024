package com.alura.literalura.Curso.service;

public interface IDadosConverter {
    <T> T getData(String json, Class<T> classe);
}
