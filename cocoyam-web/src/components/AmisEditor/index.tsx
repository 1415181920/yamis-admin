import React from 'react'
import {Editor} from 'amis-editor'
import {toast} from 'amis'
import {amisRequest} from '@/service/api'
import {useHistory} from 'react-router'
import clipboard from '@/utils/clipboard'
import 'amis-editor-core/lib/style.css'
import './style/index.less'
import useSetting from '@/hooks/useSetting'

function AmisEditor({onChange, preview}) {
    const [schema, setSchema] = React.useState({} as any)
    const {getSetting} = useSetting()
    const history = useHistory()

    const change = (val) => {
        onChange(val)
    }

    const env = {
        enableAMISDebug: getSetting('show_development_tools'),
        fetcher: ({url, method, data}) => amisRequest(url, method, data),
        updateLocation: (location, replace) => {
            replace || history.push(location)
        },
        jumpTo: (location: string) => {
            if (location.startsWith('http') || location.startsWith('https')) {
                window.open(location)
            } else {
                history.push(location.startsWith('/') ? location : `/${location}`)
            }
        },
        copy: async (content) => {
            await clipboard(content)

            toast.success('复制成功')
        },
        notify: (type: 'error' | 'success', msg: string) => {
            toast[type] ? toast[type](msg) : console.warn('[Notify]', type, msg)
        }
    }

    return (
        <div className="h-full" style={{
            // @ts-ignore
            '--colors-neutral-text-1': '#141414',
            '--colors-neutral-fill-1': '#141414',
            '--colors-neutral-line-1': '#141414',
            '--colors-neutral-text-2': '#1f1f1f',
            '--colors-neutral-fill-2': '#1f1f1f',
            '--colors-neutral-line-2': '#1f1f1f',
            '--colors-neutral-text-3': '#262626',
            '--colors-neutral-fill-3': '#262626',
            '--colors-neutral-line-3': '#262626',
            '--colors-neutral-text-4': '#434343',
            '--colors-neutral-fill-4': '#434343',
            '--colors-neutral-line-4': '#434343',
            '--colors-neutral-text-5': '#595959',
            '--colors-neutral-fill-5': '#595959',
            '--colors-neutral-line-5': '#595959',
            '--colors-neutral-text-6': '#8c8c8c',
            '--colors-neutral-fill-6': '#8c8c8c',
            '--colors-neutral-line-6': '#8c8c8c',
            '--colors-neutral-text-7': '#bfbfbf',
            '--colors-neutral-fill-7': '#bfbfbf',
            '--colors-neutral-line-7': '#bfbfbf',
            '--colors-neutral-text-8': '#d9d9d9',
            '--colors-neutral-fill-8': '#d9d9d9',
            '--colors-neutral-line-8': '#d9d9d9',
            '--colors-neutral-text-9': '#f0f0f0',
            '--colors-neutral-fill-9': '#f0f0f0',
            '--colors-neutral-line-9': '#f0f0f0',
            '--colors-neutral-text-10': '#f5f5f5',
            '--colors-neutral-fill-10': '#f5f5f5',
            '--colors-neutral-line-10': '#f5f5f5',
            '--colors-neutral-text-11': '#ffffff',
            '--colors-neutral-fill-11': '#ffffff',
            '--colors-neutral-line-11': '#ffffff',
            '--Tabs-content-bg': '#ffffff',
        }}>
            <Editor theme="cxd" onChange={change} value={schema} preview={preview} amisEnv={env}/>
        </div>
    )
}

export default AmisEditor
