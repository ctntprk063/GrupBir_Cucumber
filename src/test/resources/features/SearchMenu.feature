@wip
Feature: Login and search Test

  Scenario  As a user I should be able to search in the search engine
    Given The user is on the login page

    When  The user searches for the product on the website, they must verify that the product is displayed
    Then Verify item not found is displayed when user searches for item not on website
    And Can verify that search results contain accurate and up-to-date information on product features and pricing
    When Users can save search results according to the criteria they want
    And Search menu is case sensitive
    And search menu works with numbers and signs
    And A photo or price of any product should appear on the search results page

#kullanici urunu web sitesinde arama yaptiginda urunun göruntulendigini dogrulayabilmeli
#kullanicinin web sitesinde olmayan ogeyi aradiginda "urun bulunamadi mesajini goruntulendigini dogrulayin"
#Arama sonuçları, ürün özellikleri ve fiyatlandırma konusunda doğru ve güncel bilgiler içerdigini dogrulayabilmeli
#Kullanıcılar, arama sonuçlarını istedikleri kriterlere göre kaydedebilir .
#search menusu case sensitivdir
#search menüsü rakam ve isaretlerle calisir
# Arama sonuçları sayfasında, herhangi bir ürünün fotoğrafı veya fiyatı görünmeli













