package com.ssafy.backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DebateFinPlayerDto {

  private String nickName;
  private int vote;
  private int hp;
  private int coin;
  private int getCoin;
  private int exp;
  private int getExp;

  public DebateFinPlayerDto(String nickName, int vote, int hp) {
    this.nickName = nickName;
    this.vote = vote;
    this.hp = hp;
  }

  public void insertDto(int coin, int getCoin, int exp, int getExp) {
    this.coin = coin;
    this.getCoin = getCoin;
    this.exp = exp;
    this.getExp = getExp;
  }

}
