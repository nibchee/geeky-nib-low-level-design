package designPatterns.Behavioural.Iterator.example1_IterateSocialProfiles.iterators;

import designPatterns.Behavioural.Iterator.example1_IterateSocialProfiles.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
