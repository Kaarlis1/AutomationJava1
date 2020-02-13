package screens;

import testUI.elements.UIElement;

import static testUI.Utils.By.*;
import static testUI.elements.TestUI.E;

public class LandingScreens {

    private final UIElement shoppingListInput =
            E(byAndroidUIAutomator("textContains(\"Add a shopping list\")"));
    private final UIElement inputShopingList = E(byId("editText"));
    private final UIElement addAShopingList = E(byId("android:id/button1"));
    private final UIElement goInList1 =
            E(byAndroidUIAutomator("textContains(\"First List\")"));
    private final UIElement openMenuBar = E(byAccesibilityId("More options"));
    private final UIElement deleteButton =
            E(byAndroidUIAutomator("textContains(\"Delete list\")"));
    private final UIElement pressDeletebtn = E(byId("android:id/button1"));


    public void addShopingList() {
        shoppingListInput.click();
    }

    public void typeInShoppingList(String var) {
        inputShopingList.sendKeys(var);
    }

    public void addAShopinglistButton() {
        addAShopingList.shouldBe().attribute("text").equalTo("ADD LIST");
        addAShopingList.click();
    }

    public void AddsToList(String arg) {
        UIElement element = E(byAndroidUIAutomator("textContains(\"" + arg + "\")"));
        element.waitFor(5).untilIsVisible();
    }

    public void opensList1() {
        goInList1.click();
    }

    public void openMenu() {
        openMenuBar.click();
    }

    public void pressDelete() {
        deleteButton.click();
    }

    public void confrimDelete() {
        pressDeletebtn.click();
    }

    public void check (String arg) {
        UIElement element = E(byAndroidUIAutomator("textContains(\"First List\")"));
        element.waitFor(5).untilNotVisible();
    }

}