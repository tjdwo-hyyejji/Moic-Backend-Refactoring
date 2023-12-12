package com.finp.moic.card.adapter.out.persistence;

import com.finp.moic.card.application.response.CardMineServiceResponse;

import java.util.List;

public interface UserCardQueryPort {

    Boolean exist(String userId, String cardName);

    List<String> findAllCardNameByUserId(String userId);

    List<CardMineServiceResponse> findAllByUserId(String userId);
}