package dev.eggnstone.chime.observers

import com.amazonaws.services.chime.sdk.meetings.audiovideo.video.VideoTileObserver
import com.amazonaws.services.chime.sdk.meetings.audiovideo.video.VideoTileState
import io.flutter.plugin.common.EventChannel.EventSink
import org.json.JSONObject

class ChimeVideoTileObserver(private val _eventSink: EventSink) : VideoTileObserver
{
    override fun onVideoTileAdded(tileState: VideoTileState)
    {
        val jsonObject = JSONObject()
        val eventArguments = JSONObject()
        eventArguments.put("tileId", tileState.tileId)
        jsonObject.put("name", "onVideoTileAdded")
        jsonObject.put("arguments", eventArguments)
        _eventSink.success(jsonObject.toString())
    }

    override fun onVideoTilePaused(tileState: VideoTileState)
    {
        val jsonObject = JSONObject()
        val eventArguments = JSONObject()
        eventArguments.put("tileId", tileState.tileId)
        jsonObject.put("name", "onVideoTilePaused")
        jsonObject.put("arguments", eventArguments)
        _eventSink.success(jsonObject.toString())
    }

    override fun onVideoTileRemoved(tileState: VideoTileState)
    {
        val jsonObject = JSONObject()
        val eventArguments = JSONObject()
        eventArguments.put("tileId", tileState.tileId)
        jsonObject.put("name", "onVideoTileRemoved")
        jsonObject.put("arguments", eventArguments)
        _eventSink.success(jsonObject.toString())
    }

    override fun onVideoTileResumed(tileState: VideoTileState)
    {
        val jsonObject = JSONObject()
        val eventArguments = JSONObject()
        eventArguments.put("tileId", tileState.tileId)
        jsonObject.put("name", "onVideoTileResumed")
        jsonObject.put("arguments", eventArguments)
        _eventSink.success(jsonObject.toString())
    }
}
