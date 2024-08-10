package designPatterns.Behavioural.Iterator.example1_IterateSocialProfiles.socialnetworks;

import designPatterns.Behavioural.Iterator.example1_IterateSocialProfiles.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
