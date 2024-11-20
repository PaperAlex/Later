package ru.practicum.item;

import lombok.Builder;

import java.time.LocalDateTime;

@lombok.Value
@Builder(toBuilder = true)
public class UrlMetadataImpl implements UrlMetaDataRetriever.UrlMetadata {
    String normalUrl;
    String resolvedUrl;
    String mimeType;
    String title;
    boolean hasImage;
    boolean hasVideo;
    LocalDateTime dateResolved;
}