package me.johnalcher.kapampangan;

/**
 * Created by alchermd on 2/9/18.
 */

/**
 * A custom class to store translation-related information
 */
public class Word {
    protected String mKapampanganTranslation;
    protected String mTagalogTranslation;
    protected String mEnglishTranslation;

    /**
     * @param kapampanganTranslation - the Kapampangan translation
     * @param tagalogTranslation     - the Tagalog translation
     * @param englishTranslation     - the English translation
     */
    public Word(String kapampanganTranslation, String tagalogTranslation, String englishTranslation) {
        mKapampanganTranslation = kapampanganTranslation;
        mTagalogTranslation = tagalogTranslation;
        mEnglishTranslation = englishTranslation;
    }

    /**
     * Gets the Kapampangan translation
     *
     * @return the Kapampangan translation
     */
    public String getKapampanganTranslation() {
        return mKapampanganTranslation;
    }

    /**
     * Sets the Kapampangan translation
     *
     * @param kapampanganTranslation - the Kapampangan translation
     */
    public void setKapampanganTranslation(String kapampanganTranslation) {
        mKapampanganTranslation = kapampanganTranslation;
    }

    /**
     * Gets the Tagalog translation
     *
     * @return the Tagalog translation
     */
    public String getTagalogTranslation() {
        return mTagalogTranslation;
    }


    /**
     * Sets the Tagalog translation
     *
     * @param tagalogTranslation - the Tagalog translation
     */
    public void setTagalogTranslation(String tagalogTranslation) {
        mTagalogTranslation = tagalogTranslation;
    }

    /**
     * Gets the English translation
     *
     * @return the English translation
     */
    public String getEnglishTranslation() {
        return mEnglishTranslation;
    }


    /**
     * Sets the English translation.
     *
     * @param englishTranslation
     */
    public void setEnglishTranslation(String englishTranslation) {
        mEnglishTranslation = englishTranslation;
    }

}
