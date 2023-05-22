package ahn.sungsin.shop.entity.form;

import ahn.sungsin.shop.constant.ItemSellStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class MemberFormDto {
    private String name;
    private String email;
    private String password;
    private String address;

}