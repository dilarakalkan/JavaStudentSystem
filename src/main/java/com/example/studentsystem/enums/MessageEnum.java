package com.example.studentsystem.enums;

import lombok.Getter;

@Getter

public enum MessageEnum {
    ISLEM_BASARILI("İşlem başarılı."),
    HATA("Bir hata oluştu."),
    BULUNAMADI("Bulunamadı.");
    private final String messages1;

    MessageEnum(String messages1) {
        this.messages1 = messages1;
    }
}
