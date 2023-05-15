Feature: Login and search Test

  @wip
  Scenario:  As a user I should be able to search in the search engine

    Given The user is on the login page
    When The user enters valid credentials
    Then The user should be able to login
    When  The user searches for the product on the website, they must verify that the "books" is displayed
    Then Verify item not found is displayed when user searches for item not on website
    And Search menu is case sensitive "BOOKS"
    And search menu works with numbers and signs "*@1§4"
    And A photo or price of any product should appear on the search results page "Computer"

#kullanici urunu web sitesinde arama yaptiginda urunun göruntulendigini dogrulayabilmeli
#kullanicinin web sitesinde olmayan ogeyi aradiginda "urun bulunamadi mesajini goruntulendigini dogrulayin"

#Kullanıcılar, arama sonuçlarını istedikleri kriterlere göre kaydedebilir .
#search menusu case sensitivdir
#search menüsü rakam ve isaretlerle calisir
# Arama sonuçları sayfasında, herhangi bir ürünün fotoğrafı veya fiyatı görünmeli













