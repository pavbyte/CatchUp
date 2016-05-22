package io.sweers.catchup.data.medium;

import io.sweers.catchup.data.medium.model.MediumResponse;
import retrofit2.http.GET;
import rx.Observable;

public interface MediumService {

  String HOST = "medium.com";
  String ENDPOINT = "https://" + HOST;

  @GET("/browse/top")
  Observable<MediumResponse> top();
}